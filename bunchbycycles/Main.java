package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
    //int low,medium,high;
//     if(counts<100)
//       System.out.println("low");
//     else if(counts<900 && counts>450)
//       System.out.println("medium");
//     else if(counts>1000)
//       System.out.println("High");
    
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    Scanner sc= new  Scanner (System.in);
    System.out.println("Enter the number of Battries");
    int n = sc.nextInt();
    int [] a1=new Int[n];
    for(int i=0;i<n;i++){
      a1[i]= sc.nextInt();
    }
     testBucketingByNumberOfCycles(a1);

    
  }
}
