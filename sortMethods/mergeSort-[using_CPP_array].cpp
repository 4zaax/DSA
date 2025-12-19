#include <array>
#include <cstddef>
#include <iostream>
using namespace std;


template <std::size_t N, std::size_t M>
std::array<int, N + M> mergeSorted(const std::array<int, N>& a,
                                  const std::array<int, M>& b)
{
    std::array<int, N + M> res;
    std::size_t i = 0, j = 0, k = 0;

    while (i < N && j < M) {
        if (a[i] <= b[j]) res[k++] = a[i++];
        else              res[k++] = b[j++];
    }
    while (i < N) res[k++] = a[i++];
    while (j < M) res[k++] = b[j++];
    return res;
}

template    <
            std::size_t N,
            std::size_t Start, 
            std::size_t Len
            >
std::array<int, Len> slice(const std::array<int, N>& a)
{
    std::array<int, Len> res;
    for (std::size_t i = 0; i < Len; ++i)
        res[i] = a[Start + i];
    return res;
}

template <std::size_t N>
std::array<int, N> mergeSort(const std::array<int, N>& a)
{
    if constexpr (N <= 1) {
        return a;
    } else {
        constexpr std::size_t mid = N / 2;

        auto left  = mergeSort(slice<N, 0, mid>(a));
        auto right = mergeSort(slice<N, mid, N - mid>(a));

        return mergeSorted(left, right);
    }
}

int main(){
    std::array<int, 5> ar{5, -1, 2, -3, 4};
    auto sorted = mergeSort(ar);
    for (auto i : sorted){
        cout << i << endl;
    }
}