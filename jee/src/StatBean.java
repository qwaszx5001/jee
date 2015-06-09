
public class StatBean {
	private boolean statCreated; // 통계 생성여부
	private int statNo; // 통계No
	private int visitorCnt; // 방문자 수
	private int ageGroup; // 나이대
	private int bookNo; // 책No
	private String bookName; // 책이름
	private String bookAuthor; // 저자
	private String publisher; // 출판사
	private String category; // 카테고리
	private int bookRentCnt; // 책 대여수
	private int bookSearchCnt; // 검색횟수
	
	
	public boolean isStatCreated() {
		return statCreated;
	}
	public void setStatCreated(boolean statCreated) {
		this.statCreated = statCreated;
	}
	public int getStatNo() {
		return statNo;
	}
	public void setStatNo(int statNo) {
		this.statNo = statNo;
	}
	public int getVisitorCnt() {
		return visitorCnt;
	}
	public void setVisitorCnt(int visitorCnt) {
		this.visitorCnt = visitorCnt;
	}
	public int getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBookRentCnt() {
		return bookRentCnt;
	}
	public void setBookRentCnt(int bookRentCnt) {
		this.bookRentCnt = bookRentCnt;
	}
	public int getBookSearchCnt() {
		return bookSearchCnt;
	}
	public void setBookSearchCnt(int bookSearchCnt) {
		this.bookSearchCnt = bookSearchCnt;
	}
	
	
	
	
}
