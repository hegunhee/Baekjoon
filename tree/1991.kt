val tree = mutableMapOf<String, Array<String>>()
fun main() {
    val br = System.`in`.bufferedReader()
    repeat(br.readLine().toInt()) {
        val word = br.readLine().split(" ")
        tree.put(word[0], arrayOf(word[1], word[2]))
    }
    preorder("A")
    println()
    inorder("A")
    println()
    postorder("A")
}
fun preorder(here : String){
    print(here)
    if(tree[here]?.get(0) != "."){
        tree[here]?.get(0)?.let { preorder(it) }
    }
    if(tree[here]?.get(1) != "."){
        tree[here]?.get(1)?.let { preorder(it) }
    }

}
fun inorder(here : String){

    if(tree[here]?.get(0) != "."){
        tree[here]?.get(0)?.let { inorder(it) }
    }
    print(here)
    if(tree[here]?.get(1) != "."){
        tree[here]?.get(1)?.let { inorder(it) }
    }
}
fun postorder(here : String){

    if(tree[here]?.get(0) != "."){
        tree[here]?.get(0)?.let { postorder(it) }
    }
    if(tree[here]?.get(1) != "."){
        tree[here]?.get(1)?.let { postorder(it) }
    }
    print(here)
}