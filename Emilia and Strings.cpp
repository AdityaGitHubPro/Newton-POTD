Question Link: https://my.newtonschool.co/playground/code/o1yghl5rx36g



#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    int k;
    cin >> s >> k;

    sort(s.begin(), s.end());
    int cnt = 1;
    do {
        if (cnt == k) {
            cout << s << endl;
            break;
        }
        cnt++;
    } while (next_permutation(s.begin(), s.end()));

    return 0;
}
