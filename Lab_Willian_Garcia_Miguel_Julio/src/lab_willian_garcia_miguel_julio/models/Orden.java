package lab_willian_garcia_miguel_julio.models;

public class Orden {
    int mesa;
    Plato pedido;
    long mesero;
    Orden link;
    public Orden(int mesa,Plato pedido,long mesero) {
        this.mesero=mesero;
        this.mesa=mesa;
        this.pedido=pedido;
        link=null;
    }

    public long getMesero() {
        return mesero;
    }
    public boolean busO(int m) {//mesa m esta en las ordenes true sino false
        Orden temp=this;
        while(temp!=null){
            if(temp.getMesa()==m)return true;
            temp=temp.getLink();
        }
        return false;
    }
     public Plato busOrden(int m) {
        Orden temp=this;
        while(temp!=null){
            if(temp.getMesa()==m)return temp.getPedido();
            temp=temp.getLink();
        }
        return null;
    }
    public void setMesero(long mesero) {
        this.mesero = mesero;
    }
    
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Plato getPedido() {
        return pedido;
    }

    public void setPedido(Plato pedido) {
        this.pedido = pedido;
    }
    
    public Orden getLink() {
        return link;
    }

    public void setLink(Orden link) {
        this.link = link;
    }
    
    public void addOrden(int mesa,Plato pedido,long cc) {
        Orden temp=this,nueva=new Orden(mesa,pedido,cc);
        while(temp.getLink()!=null){
            temp=temp.getLink();
        }
        temp.setLink(nueva);
    }
     public void mostar(){
        Orden temp=this;
        while(temp!=null){
            System.out.print(" mesa "+temp.getMesa()+"\nPedido\n");
                temp.getPedido().imprimir();
            System.out.println("F.pedido");
            temp=temp.getLink();
        }
    
    }
}


