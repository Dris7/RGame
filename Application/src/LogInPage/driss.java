package LogInPage;

public class driss {
	public static void main(String[] args) 
	{
		
		String date ="2/22/202200";
		Date d=getDate(date); 
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
		
	}
	public static Date getDate(String date) {
		Date dt=new Date(0,0,0);
		int in=0;
		
		int [] pos =new int[2];
		for(int i=0;i<date.length();i++){
			if(date.charAt(i)=='/') {
				pos[in]=i;
				in++;
				
				//System.out.println(i);
				
			}
			
			
		}
		dt.setDay(Integer.parseInt(date.substring(0, pos[0])));
		//System.out.println(date.substring(0, pos[0]));
		dt.setMonth(Integer.parseInt(date.substring(pos[0]+1, pos[1])));
		//System.out.println(date.substring(pos[0]+1, pos[1]));
		dt.setYear(Integer.parseInt(date.substring(pos[1]+1)));
		//System.out.println(date.substring(pos[1]+1));
		
		
		
		return dt;
	}
}

