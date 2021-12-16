package testcases.collections;

import java.util.ArrayList;
import java.util.List;

import testcases.TcElement;

/**
 * Eine Liste von Unterbäumen für ein Kind
 *
 */
public class ListOfSubtree {
	private List<TcElement> list = new ArrayList<>();
	
	/**
	 * Permutiert die Liste der Unterbäume für das aktuelle Kind mit den Listen der Listen der Unterbäume der "nachfolgenden Kinder"
	 * @param inLoLosTail
	 * @return
	 */
	public ListOfListOfSubtree permutate(ListOfListOfSubtree inLoLosTail) {
		ListOfListOfSubtree result = new ListOfListOfSubtree();
		
		if (list.isEmpty() && inLoLosTail.isEmpty()) {
			result.add(new ListOfSubtree());
			return result;
		}
		
		for (TcElement curElement : list) {
			if (inLoLosTail.isEmpty()) {
				ListOfSubtree curPermutation = new ListOfSubtree();
				curPermutation.add(curElement);
				result.add(curPermutation);
			} else {
				for (ListOfSubtree curTail: inLoLosTail.getList()) {
					ListOfSubtree curPermutation = new ListOfSubtree();
					curPermutation.add(curElement);
					curPermutation.addAll(curTail);		
					result.getList().add(curPermutation);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * @param inList
	 */
	private void addAll(ListOfSubtree inList) {
		list.addAll(inList.list);		
	}

	/**
	 * @param inElement
	 */
	public void add(TcElement inElement) {
		list.add(inElement);
	}

	/**
	 * @return
	 */
	public List<TcElement> getList() {
		return list;
	}

}
