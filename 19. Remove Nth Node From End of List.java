/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    

    struct ListNode *temp = head;
    if(temp->next==0)
        return NULL;

    int count=0;
    while(temp!=0)
    {
        count++;
        temp = temp->next;
    }
    int node = count - n;
    if(node==0)
    {
        head = head->next;
        return head;
    }
    temp = head;
    int i=0;
    while(temp!=0 && i<node-1)
    {
        i++;
        temp=temp->next;
    }

   if (temp != NULL && temp->next != NULL) {
        struct ListNode *toDelete = temp->next;
        temp->next = temp->next->next;
        free(toDelete);
    }


    return head;
}
