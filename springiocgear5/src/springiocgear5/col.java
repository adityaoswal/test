package springiocgear5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class col {

	private List list;
	private Set set;
	private Map map;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
//	public col(List list, Set set, Map map) {
//		super();
//		this.list = list;
//		this.set = set;
//		this.map = map;
//	}
	@Override
	public String toString() {
		return "col [list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	
	
	
}
