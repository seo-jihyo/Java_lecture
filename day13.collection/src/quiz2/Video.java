package quiz2;

import java.util.Date;

public class Video {

	protected String title;
	protected String category;
	protected char lend;
	protected String lendName;
	protected Date lendDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public char isLend() {
		return lend;
	}
	public void setLend(char lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", category=" + category + ", lend=" + lend + ", lendName=" + lendName
				+ ", lendDate=" + lendDate + "]";
	}

}
