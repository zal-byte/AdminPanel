//Admin panel finder JAVA
//Code by rizal



public class admin{
	String url,path;
	public void main(String args[]){
	
		System.out.print("URL : ");
		Scanner scan = new Scanner(System.in);
		url = scan.next();
		System.out.println("wordlist path : ");
		path = scan.next();
		
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String k;
		while((k = br.readLine()) != null){
		
			final URL = new URL(url+"/"+k);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			String response = String.valueOf(con.getResponseCode);
			System.out.printlnt("LINK : " + url +"/"+k +"\n"+Status : "+response);
		
		}
		
	
	}

}