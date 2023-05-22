
class Loop
{

    static void printArray(int[] n,int i)
    {
        if(i>=0){
    System.out.println(n[i]);
    
    printArray( n,i-1);
        }
}
}
class Test{
    public static void main(String[] args) {
        int a[]={3,4,6,7,8};
        Loop.printArray(a,a.length-1);
        // a.printArray(a,);
    }
}