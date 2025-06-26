package BinaryTrees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DnSerialize {
	
//	Serialize
	
	public String rSerialize(TreeNode node, String str) {
		
		if (node == null) {
			str += "null,";
			return str;
		}
		
		str += String.valueOf(node.val) + ",";
		
		str = rSerialize(node.left, str);
		str = rSerialize(node.right, str);
		
		
		return str;
		
		
	}
	
	
	public String serialize (TreeNode root) {
		
		return rSerialize(root, "");
	}
	
	
//	Deserialize
	
	public TreeNode rDeserialize(List<String> sld) {
		if (sld.get(0).equals("null")) {
			sld.remove(0);
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.valueOf(sld.get(0)));
		sld.remove(0);
		root.left = rDeserialize(sld);
		root.right = rDeserialize(sld);
		
		
		return root;
	}
	
	
	public TreeNode deserialize(String data) {
		String[] data_array = data.split(data);
		List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
		
		return rDeserialize(data_list);
		
	}
	
	
	
	
}
