import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class News{
	int newId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newId = newId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newId=" + newId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
}
public class News_Que {

	private static final char[] Map = null;

	public static void main(String[] args) {
		News n1=new News(1,"Amruta","abc","Your budget is going high");
		News n2=new News(1,"Amruta","xyz","Your budget is balanced");
		News n3=new News(1,"Amruta","pqr","Your budget is low");
		News n4=new News(1,"Amruta","uvw","Your budget is increasing");
		News n5=new News(2,"Snehal","abc","Your budget is balanced");
		News n6=new News(2,"Snehal","pqr","Your budget is low");
		News n7=new News(2,"Snehal","xyz","Your budget is balanced");
		News n8=new News(3,"Sonali","abc","Your budget");
		News n9=new News(3,"Sonali","uvw","Your budget is high");
		News n10=new News(4,"Sakshi","abc","Your budget is balanced");
		
		List<News> news=new ArrayList<>();
		news.add(n1);
		news.add(n2);
		news.add(n3);
		news.add(n4);
		news.add(n5);
		news.add(n6);
		news.add(n7);
		news.add(n8);
		news.add(n9);
		news.add(n10);
		
		int l = 0;
		//Que4
		System.out.println("--------NewsId which received max comments--------");
		for(News i:news) {
			if(i.getComment().length()>l) {
				l=i.getComment().length();
			}
		}
		for(News i:news) {
			if(i.getComment().length()==l) {
				System.out.println(i.getNewId());
			}
		}
		
		//Que5
		Long count=news.stream().filter(P->P.getComment().contains("budget")).count();
		System.out.println("budget appeared in comments "+count+" times");
		
		//Que6
		/*List<String> com=new ArrayList<String>();
		for(News i:news) {
			com.add(i.getCommentByUser());
		}
		String maxVal = com.stream()
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
	            .map(Map.Entry::getKey).orElse(null);
		
		System.out.println(maxVal);
		
		*/
		
		//Que7
		//List<News> CommentByUser=news.stream().sorted(Comparator.comparing(News::getCommentByUser)).distinct().collect(Collectors.toList());
		//CommentByUser.forEach(System.out::println);
		//Map<News, Long> result = news.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//System.out.println(result);
	}

}
