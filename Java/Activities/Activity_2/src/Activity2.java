
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {10,77,10,-55,12,10};
int sum=0;
for(int i=0;i<num.length;i++)
{
	if(num[i]==10) {
		sum=sum+num[i];
	}
}
if(sum==30)
{
	System.out.println("The sum is exactly equal to 30");
}
else
{
	System.out.println("Not 30");
}

	}

}
