package principal;

import com.auth.Usuario;
import com.auth.Credencial;

public class Principal {

    public static void main(String[] args) {

        // Crear un arreglo para almacenar usuarios
        String[] usuarios = new String[10];

        // Crear instancias de Usuario
        Usuario usuario1 = new Usuario("Daniel", "Gutiérrez", "dgm1021999@gmail.com", "Password1");
        Usuario usuario2 = new Usuario("Manolito", "Pérez", "manolitoP@gmail.com", "Password434");
        Usuario usuario3 = new Usuario("Pepe", "Castaño", "Pepep@gmail.com", "Password343r");

        usuarios[0] = usuario1.toString();
        usuarios[1] = usuario2.toString();
        usuarios[2] = usuario3.toString();

        // Intentar hacer login con diferentes credenciales
        usuario1.hacerLogin("dgm1021999@gmail.com", "Password1"); // Credenciales correctas
        usuario1.hacerLogin("dgm1021999@gmail.com", "Password13"); // Contraseña incorrecta
        usuario1.hacerLogin("dgm1021999@gmail.com", "password1"); // Contraseña incorrecta
        usuario1.hacerLogin("dgm1021999@gmail.com", "password1"); // Contraseña incorrecta

        // Modificar la contraseña del usuario1
        usuario1.modificarPassword("Password1", "Password234", "Password234");

        // Mostrar la información del usuario1
        usuario1.mostrarInformacion();
        usuario2.mostrarInformacion();

        // Verificar si la cuenta del usuario1 está bloqueada
        usuario1.esCuentaBloqueada();
    }
}