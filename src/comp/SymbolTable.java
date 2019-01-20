package comp;

import java.util.Hashtable;
import ast.Member;


public class SymbolTable {
    private Hashtable classMembers;
    private Hashtable globalVarTable;
    private Hashtable functions;
    private Hashtable classes;


    //builder
    public SymbolTable(){

        /* About "members":
        * The name of a method or classfield (instance variable) should be different
        * from the name of the previous members of the class and
        * different from the class name.
        * */

        this.classMembers = new Hashtable();
        this.globalVarTable = new Hashtable();
        this.classes = new Hashtable();
    }

    //limpa tabela de membros
    public void resetClassMembers(){
        this.classMembers.clear();
    }

    //Insere novos membros da classe
    public void insertClassMember(String key, Member member){
        this.classMembers.put(key, member);
    }
    //continue ...
}
