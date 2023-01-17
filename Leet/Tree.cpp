#include <bits/stdc++.h>
using namespace std;
#include <queue>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

TreeNode *invertTree(TreeNode *head)
{

    TreeNode *res = head;
    vector<char> v = {};
    queue<TreeNode *> q;
    // vector<int> v = {};
    // node *local = head;
    char temp;
    if (head == NULL)
    {
        return v;
    }
    else
    {
        q.push(head);
    }
    while (q.empty() != true)
    {
        head = q.front();
        v.push_back(head->val);

        if (head->left != NULL && head->right != NULL)
        {
            q.push(head->left);
            q.push(head->right);
        }

        else if (head->left == NULL && head->right != NULL)
        {
            q.push(head->right);
        }
        else if (head->right == NULL && head->left != NULL)
        {
            q.push(head->left);
        }
        else
        {
            // cout<<"Reached end "<<head->val<<endl;
        }

        q.pop();
    }
    return v;
}
}
;