package week2;

import java.util.Arrays;

public class HomeWork {
    /**
     * Home work for ITEA BASE week 2
     */

    private static int[] nums = new int[10];
    private static int size = 0;

    public static void main(String[] args) {

        add(10);
        add(5);
        add(7);
        add(2);
        add(15);
        add(5);
        add(0);
        add(2);
        add(10);
        add(5);
        add(2);
        add(2);
        add(13);
        add(1);
        add(7);
        add(9);

        get(4);

        sort();

        search(7);

        add(9, 10);

        replace ( 3, 6);

        remove(5);

        removeValue(10);

        invert();

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(subArray(3, 8)));

        System.out.println(getString());
    }

    /**
     * Add int value to the end of array.
     * if array outs index of bounds copy all values
     * to new bigger array.
     *
     * @param value - new value for nums field.
     */
    private static void add(int value) {
        if(nums.length <= size){
            copyArray();
        }
        nums[size++] = value;
    }


    private static void copyArray() {
        int[] newArray = new int[nums.length * 2];
        System.arraycopy(nums, 0, newArray, 0, nums.length);
        nums = newArray;
    }

    /**
     * @return value from this index.
     * @param index in nums.
     * @throws ArrayIndexOutOfBoundsException if no such
     *         index in nums.
     */
    private static int get(int index){

        return nums[index];
    }

    /**
     * Ascending sorts nums
     */
    private static void sort() {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int box = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = box;
                }
            }
        }
    }

    /**
     * @return first founded index
     *      which associated with this value,
     *      or -1 if was not found such value.
     * @param value - searched value in nums
     */
    private static int search(int value) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == value){
                return i;
            }
        }
        return -1;
    }

    /**
     * Add new value or replace old value
     * @return return old value or -1.
     * @param index of nums
     * @param value for insert.
     *
     * @throws ArrayIndexOutOfBoundsException if no such
     *         index in nums.
     */
    private static int add(int index, int value) {

        return -1;
    }


    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param value element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if no such
     *          index in nums.
     */
    private static int replace(int index, int value) {
        int position = index;
        for (int i = position; i < nums.length; i++) {
            index = nums[i];
            nums[i] = value;
            value = index;
            return value;

        }
        return -1;
    }


    /**
     * @return removed value.
     * @param index removed value.
     * @throws ArrayIndexOutOfBoundsException if no such
     *          index in nums.
     */
    private static int remove(int index) {
        int[] newArray = new int[nums.length - 1];

        System.arraycopy(nums, 0, newArray, 0, index );
        System.arraycopy(nums, index+1, newArray, index, nums.length - index-1);
        nums = newArray;
        return index;
    }

    /**
     * @return removed value or -1 if was not found
     * @param value removed value.
     */
    private static int removeValue(int value) {
        int[] newArray = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == value) {

                System.arraycopy(nums, 0, newArray, 0, i);
                System.arraycopy(nums, i + 1, newArray, i, nums.length - i - 1);
                nums = newArray;
                break;

            }
            return value;
        }
        return -1;
    }

    /**
     * Inverts nums
     */
    private static void invert() {
        for (int i = 0; i < nums.length / 2; i++) {
            int box = nums[i];
            nums[i] = nums[nums.length - i -1];
            nums[nums.length - i - 1] = box;
        }
    }

    /**
     * Makes copy of nums from first index to last index which
     * was received from params.
     *
     * @param from first index of subArray
     * @param to last index of subArray
     * @return subArray of the nums
     * @throws ArrayIndexOutOfBoundsException if no such
     *         indexes in nums.
     */
    private static int[] subArray(int from, int to) {
        int[] newArray = new int[to - from  + 1 ];
        System.arraycopy( nums, from, newArray, 0,to - from + 1);
        return newArray;
    }

    /**
     * Convert nums into string.
     * @return nums in string format.
     */
    private static String getString(){
        String newString = Arrays.toString(nums);
        newString = newString.substring(1, newString.length() - 1);

        return newString;
    }

}
