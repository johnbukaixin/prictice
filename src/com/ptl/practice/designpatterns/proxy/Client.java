package com.ptl.practice.designpatterns.proxy;

import java.util.List;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new TargetImpl(),new ChildLogger());
        proxy.execute();

        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);

        ListNode l3 = addTwoNumbers(l1,l2);

        System.out.println(l3);
    }
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i = 0 ; i < nums.length ; i++){
//            for(int j = i +1 ; j < nums.length; j ++){
//                if(nums[i] + nums[j] == target){
//                    int[] result = new int[]{i,j};
//                    System.out.println(result);
//                    return result;
//                }
//            }
//        }
//        return null;
//    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null){
            return null;
        }
        //进位
        int tens = 0;

        int single = (l1.val + l2.val + tens) % 10;
        ListNode  l3 = new ListNode(single);

        tens = (l1.val + l2.val + tens) / 10;
        while (l1.next != null && l2.next != null){
            l3 = new ListNode(l1.val + l2.val + tens);
            tens = (l1.val + l2.val) / 10;
            l3.next = new ListNode(tens);
        }
        if (l1.next == null && l2.next == null){
            return l3;
        }else if (l1.next != null){
            l3.next = new ListNode(l1.next.val + tens);
        }else if (l2.next != null){
            l3.next = new ListNode(l2.next.val +tens);
        }
        return l3;
    }


}
