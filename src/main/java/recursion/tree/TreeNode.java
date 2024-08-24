package recursion.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String value;
    List<TreeNode> children = new ArrayList<TreeNode>();

    TreeNode(String value){
        this.value = value;
    }

    public void addChild(TreeNode child){
        this.children.add(child);
    }
}
