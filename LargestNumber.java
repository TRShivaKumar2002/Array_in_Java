class LargestNumber { 
    public static void main(String args[]) { 
        int[] a = new int[] { 20, 30, 50,0, 71, 100}; 
        int max = a[0]; 
        int min = a[0];

        for(int i = 1; i < a.length;i++) { 
            if(a[i] > max)
           { 
              max = a[i]; 
            } 
            else if(a[i] < min)
            {
                min=a[i];
            }
System.out.println("From The Array Element Largest Number is:" + max +"and its index position"+ i); 
System.out.println("From The Array Element Small Number is:" + min);
        } 
        
        
         
System.out.println("The Given Array Element is:"); 
        for(int i = 0; i < a.length;i++)
        { 
            System.out.println(a[i]); 
        } 
    } 
}