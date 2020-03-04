import java.util.*;

class Program10
{
  
	  static List<String> places=new ArrayList<>();
	  public static List getPlaces(){
		  places.add("Nepal,Kathmandu");
		  places.add("Nepal,Pokara");
		  places.add("India,Delhi");
		  places.add("USA,Newyork");
		  places.add("Africa,Nigeria");
		  return places;
	  }
	  public static void main(String args[])
      {
		  List<String> myPlaces=getPlaces();
		  System.out.println("Places from nepal");
		  myPlaces.forEach(a->{if(a.contains("Nepal"))System.out.println(a);});
       }
}