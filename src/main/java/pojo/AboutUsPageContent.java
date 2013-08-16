package pojo;

public class AboutUsPageContent extends PageContent{
	private Integer id;
	private String title;
	private String paragraph;
	
	private String paragraph2;
	private String paragraph3;
	private Long publishTime;
	
	
	public String getParagraph2() {
		return paragraph2;
	}

	public void setParagraph2(String paragraph2) {
		this.paragraph2 = paragraph2;
	}

	public String getParagraph3() {
		return paragraph3;
	}

	public void setParagraph3(String paragraph3) {
		this.paragraph3 = paragraph3;
	}


	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}


	
	
	public AboutUsPageContent(){
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	
	
	
	
}
