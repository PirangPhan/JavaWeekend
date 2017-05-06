package nestedclass;

public class StaticClassMain {
	public static void main(String[] args) {
		User.Article article = new User.Article();
		article.setId(1);
		article.setTitle("Breaking News");
		
		User user = new User(article);
		System.out.println(user.getArticle().getTitle());
	}
}

class User {
	
	private Article article;	
	
	public User(Article article) {
		this.article = article;
	}

	static class Article {
		private int id;
		private String title;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}

	public Article getArticle() {
		return article;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}
}
