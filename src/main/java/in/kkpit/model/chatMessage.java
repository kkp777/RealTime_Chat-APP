package in.kkpit.model;

public class chatMessage {
	private Long id;
	private String sender;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	@Override
	public String toString() {
		return "chatMessage [id=" + id + ", sender=" + sender + ", content=" + content + "]";
	}
	public chatMessage(Long id, String sender, String content) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public chatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

}
