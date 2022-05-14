package Collection;

import java.util.PriorityQueue;

public class PriorityQueueProgram {
    public static void main(String[] args) {
        /*It is auto sorted
        size is dynamic 
we can store heterogenous type of data
It is not indexed type of collections
It allows duplicates
It doesn't allow null
It is auto sorted
Since it is not a indexed type of collection we can not fetch the elements upon
index and hence we use poll() and peek()
poll()- it is a non-static method of propriety queue class which will fetch the
top most element of the queue and reduce the size of the queue by 1
peek()- it is a non-static method of propriety queue class it will fetch the top
most element of the queue and it will not reduce size of the queue by one
*/

        PriorityQueue<Object> pq=new PriorityQueue<>();
        pq.add(654);
        pq.add(54);
        pq.add(98);
        pq.add(65);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        for (int i=0;i<pq.size();i++)
            System.out.println(pq.contains(98));

    }
}
