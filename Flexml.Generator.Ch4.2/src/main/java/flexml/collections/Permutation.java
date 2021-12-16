package flexml.collections;

import java.util.ArrayList;
import java.util.List;

import flexml.Element;
import testcases.collections.ListOfListOfSubtree;
import testcases.collections.ListOfSubtree;

/**
 * Eine Liste von Element-Instanzen
 *
 */
public class Permutation {
	private List<Element> list = new ArrayList<>();
	
	
	/**
	 * Erzeugt für die aktuelle Permutation die Liste aller Permutationen der Unterbäume<br>
	 * Dafür wird für jedes Element die Liste seiner Unterbäume erzeugt,<br>
	 * und die Liste dieser Listen wird permutiert
	 * @return Siehe oben
	 */
	public ListOfListOfSubtree createListOfListOfTestdata() {
		ListOfListOfSubtree subtreeList = createListOfSubtrees();
		
		ListOfListOfSubtree result = subtreeList.createPermutations();
		return result;
	}
	
	/**
	 * Erzeugt für die aktuelle Permutation die Liste der Liste aller Unterbäume<br>
	 * Dafür erzeugt es für jedes Element der Permutation die Liste der Unterbäume<br>
	 * Wenn die Permutation leer ist, wird eine leere Liste von Unterbäumen erzeugt und in das Ergebnis eingefügt.<br>
	 * Damit hat das Ergebnis immer mindestens ein Element
	 * @return Siehe oben
	 */
	public ListOfListOfSubtree createListOfSubtrees() {
		ListOfListOfSubtree subtreeList = new ListOfListOfSubtree();
		if (list.isEmpty()) {
			subtreeList.add(new ListOfSubtree());
		} else {
			for (Element curElement : list) {
				// create list of subtrees for curElement
				ListOfSubtree losCur = curElement.createTestdataSubtrees();
				subtreeList.add(losCur);
			}
		}
		return subtreeList;
	}
	
	/**
	 * Erstellt aus der aktuellen Instanz und einer ListOfPermutation eine ListOfPermutation<br>
	 * Jedem Element aus inLopTail wird der Inhalt der aktuellen Instanz vorangestellt 
	 * @param inLopTail
	 * @return Siehe oben
	 */
	public ListOfPermutation permutate(ListOfPermutation inLopTail) {
		ListOfPermutation result = new ListOfPermutation();
		
		for (Permutation permCurTail :  inLopTail.getList()) {
			result.add(appendAndCopy(permCurTail));
			}
		return result;
		
	}
	
	/**
	 * Erzeugt eine neue Instanz<br>
	 * Besteht aus den Elementen von self und den Elementen von inPerTail
	 * @param inPerTail
	 * @return
	 */
	public Permutation appendAndCopy(Permutation inPerTail) {
		Permutation result = new Permutation();
		result.list.addAll(list);
		result.list.addAll(inPerTail.list);
		return result;
		
	}

	/**
	 * Fügt ein Element hinzu
	 * @param inElement
	 */
	public void add(Element inElement) {
		list.add(inElement);	
	}

}
