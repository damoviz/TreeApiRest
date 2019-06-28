package api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author edgarmogollon
 */
@Path("generic")
public class GenericResource {
    
    
    private static Node root; 

    @Context
    private UriInfo context;

    /**
     * Dado el tree y dos nodos devolvemos el ancestro común más cercano.
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("node1") int node1,@QueryParam("node2") int node2) {
        //TODO return proper representation object

        String rs = String.valueOf(printAncestors(root, node1,node2));
        
        return rs;
    }

    /**
     * PUT metodo para crear el Arbol
     * @param content representation for the resource
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createTree(String content) {
        
        /* Construct below tree
                 67
		/   \
               /     \
              39      76
             /   \    / \
	    28    44 74  85   
              \          / \
	       29      83   87
        */
          
        root = new Node(67);
        root.left = new Node(39);
	root.right = new Node(76);
	root.left.right = new Node(44);
        root.left.left = new Node(28);
        root.left.left.right = new Node(29);
        root.right.left = new Node(74);
        root.right.right = new Node(85);
        root.right.right.left = new Node(83);
        root.right.right.right = new Node(87);
        
        
        return root.toString();
    }
    
    public static int printAncestors(Node root, int node1, int node2){

        while (root != null) {
            
            if ( root.data > node1 && root.data > node2 ){
                root = root.left;
            }    
            else if ( root.data < node1 && root.data < node2 ){
                root = root.right;
            }
            else{
            	break;
            } 
        }
        if(root == null){
            return 0;
        }else{
            return root.data; 
        }
    }
}
