package testcases.collections;

import java.util.ArrayList;
import java.util.List;


/**
 * Jede Liste enthält die Liste von Unterbäumen zu einem Kind-Element
 *
 */
public class ListOfListOfSubtree {
	private List<ListOfSubtree> list = new ArrayList<>();
	
	/**
	 * Erzeugt alle Permutationen aus den Listen von Listen von Unterbäumen<br>
	 * Dafür werden rekursiv die Listen der Listen 0, ..., n erzeugt
	 * @return
	 */
	public ListOfListOfSubtree createPermutations() {
		return createPermutationTail(0);
	}
	
	/**
	 * @param inCurIndex
	 * @return
	 */
	private ListOfListOfSubtree createPermutationTail(int inCurIndex) {
		if (inCurIndex >= list.size()) {
			return new ListOfListOfSubtree();
		}

		// Get the list of permutations for subtrees [inCurIndex + 1] ... [list.size()]
		ListOfSubtree curListOfSubtree  = list.get(inCurIndex);
		ListOfListOfSubtree tailPermutation = createPermutationTail(inCurIndex + 1);
		
		ListOfListOfSubtree result = curListOfSubtree.permutate(tailPermutation);
		
		return result;
	}
	
	
	/**
	 * @param inListOfSubtree
	 */
	public void add(ListOfSubtree inListOfSubtree) {
		list.add(inListOfSubtree);		
	}

	/**
	 * @param inLolosTail
	 */
	public void addAll(ListOfListOfSubtree inLolosTail) {
		list.addAll(inLolosTail.list);
	}


	/**
	 * @return
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * @return
	 */
	public List<ListOfSubtree> getList() {
		return list;
	}
	
}
