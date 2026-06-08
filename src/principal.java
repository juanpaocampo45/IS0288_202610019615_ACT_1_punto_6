public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto p1 = new Producto(1, "Laptop", 3500);
        Producto p2 = new Producto(2, "Mouse", 80);
        Producto p3 = new Producto(3, "Teclado", 150);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        // Intento de duplicado
        carrito.agregarProducto(new Producto(1, "Laptop", 3500));

        carrito.mostrarCarrito();

        carrito.eliminarProducto(p2);

        carrito.mostrarCarrito();
    }
}