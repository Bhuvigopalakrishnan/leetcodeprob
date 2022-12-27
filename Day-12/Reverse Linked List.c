struct ListNode* reverseList(struct ListNode* head){
struct ListNode* prev=NULL;
struct ListNode* curr=head;
struct ListNode* nextnode=NULL;
while(curr)
{
    nextnode=curr->next;
    curr->next=prev;
    prev=curr;
    curr=nextnode;
}
return prev;
}
