
public class Project {
	
	private int pcode;
	private String ptitle;
	private int duration;
	private String clientname;
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public Project(int pcode, String ptitle, int duration, String clientname) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.duration = duration;
		this.clientname = clientname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientname == null) ? 0 : clientname.hashCode());
		result = prime * result + duration;
		result = prime * result + pcode;
		result = prime * result + ((ptitle == null) ? 0 : ptitle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (clientname == null) {
			if (other.clientname != null)
				return false;
		} else if (!clientname.equals(other.clientname))
			return false;
		if (duration != other.duration)
			return false;
		if (pcode != other.pcode)
			return false;
		if (ptitle == null) {
			if (other.ptitle != null)
				return false;
		} else if (!ptitle.equals(other.ptitle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", duration=" + duration + ", clientname="
				+ clientname + "]";
	}
	

}
