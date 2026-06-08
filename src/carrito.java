import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> carrito;

    public Carrito() {
        carrito = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {

        if (!carrito.contains(producto)) {
            carrito.add(producto);
            System.out.println(producto.getNombre() + " agregado al carrito.");
        } else {
            System.out.println("El producto ya existe en el carrito.");
        }
    }

    public void eliminarProducto(Producto producto) {

        if (carrito.remove(producto)) {
            System.out.println(producto.getNombre() + " eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarCarrito() {

        System.out.println("\n=== CARRITO DE COMPRAS ===");

        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        for (Producto producto : carrito) {
            System.out.println(producto);
        }
    }
}