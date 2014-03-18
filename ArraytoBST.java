//see the comment below to see how the code works

public Node convertToTree(int arr[],int start, int end)
    {
       if(start<=end)
      {
         int mid=(start+end)/2;
        Node temp=new Node(arr[mid]);
        System.out.println("Node created "+temp.data);
         if(root==null)
           root=temp;

       
       System.out.println("Leftchild created");
       temp.leftchild=convertToTree(arr,start,mid-1);
       
       System.out.println("Rightchild created");
       temp.rightchild=convertToTree(arr,mid+1,end);
       
       return temp;
       
      }
       else 
         return null;
     
       
    }
/*
Consider int example[]={23,34,56,77,90,112,124,155,342,564};
we call the method with(example,0,9)
mid=4, so root becomes 90.
23,34,56,77 are left children and 112,124,155,342,564 are right children.
call is(example,0,3)
34 becomes root with 23 as left child and 56,77 as right child
While on the right side the call is(example,5,9)
so mid=7,155 becomes root left child are 112,124 and right child are 342,564
and this is how recursively entire tree is created
*/
