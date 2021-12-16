package flexml.collections;

import java.util.ArrayList;
import java.util.List;

import testcases.collections.ListOfListOfSubtree;

/**
 * @author Jan
 *
 */
public class ListOfPermutation {
	private List<Permutation> list = new ArrayList<>();

	// MODIFIERS

	/**
	 * Add one Permutation instance to self
	 * @param inPermutation : Permutation to add
	 */
	public void add(Permutation inPermutation) {
		list.add(inPermutation);
	}

	/**
	 * Add all Permutation instances to self
	 * @param inLop : List of Permutations to add
	 */
	public void addAll(ListOfPermutation inLop) {
		for (Permutation curPermutation: inLop.list) {
			list.add(curPermutation);
		}
		
	}
	
	// ACCESSORS
	
	/**
	 * @return
	 */
	public ListOfListOfSubtree transformIntoSubtreePermutations() {
		ListOfListOfSubtree result  = new ListOfListOfSubtree();
		
		for (Permutation curPermutation : getList()) {
			ListOfListOfSubtree subtreesForPermutation = curPermutation.createListOfListOfTestdata();
			result.addAll(subtreesForPermutation);
		}
		return result;	
	}
	
	/**
	 * @param inLopTail
	 * @return
	 */
	public ListOfPermutation permutate(ListOfPermutation inLopTail) {
        ListOfPermutation result = new ListOfPermutation();
		for (Permutation permFront : getList()) {
			for (Permutation permTail: inLopTail.getList()) {
				result.add(permFront.appendAndCopy(permTail));
			}
		}
		return result;
	}
	
	/**
	 * @return
	 */
	public List<Permutation> getList() {
		return list;
	}
	
}
