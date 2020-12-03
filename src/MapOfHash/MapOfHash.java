package MapOfHash;
import java.util.HashMap;
import java.util.Set;

public class MapOfHash {
 public static void main(String[] args) {
	 HashMap<String, String> trackList = new HashMap<String, String>();
	 trackList.put("Jingle Bells", "Frank Sinatra");
	 trackList.put("White Christmas", "Mariah Carey");
	 trackList.put("All I Want For Christmas", "Mariah Carey");
	 trackList.put("The Little Drummer Boy", "Bing Crosby");
	 
	 
	 Set<String> Lyrics = trackList.keySet();
	 for(String track: Lyrics) {
		 System.out.println(track);
		 System.out.println(trackList.get(track));


	 }
	 
	 System.out.println(trackList.get("White Christmas"));

 }
}
