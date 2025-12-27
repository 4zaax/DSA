#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int findTheWinner(int n, int k) {
        std::vector<int> friends;
        for (int i = 1; i <= n; ++i) {
            friends.push_back(i);
        }
        int current = 0;

        while (friends.size() > 1) {
            int next_to_remove = (current + k - 1) % friends.size();
            friends.erase(friends.begin() + next_to_remove);
            current = next_to_remove;
        }
        return friends.at(0);
    }
};

int main(){
    Solution sol;
    int res = sol.findTheWinner(10,2);

}