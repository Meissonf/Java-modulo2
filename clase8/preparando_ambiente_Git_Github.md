

## 1. Instalando y configurando Git
### Windows

1. Ve al [sitio oficial de Git](https://git-scm.com) y descarga el instalador para Windows.
1. Ejecuta el archivo descargado y sigue las instrucciones del asistente de instalación.
1. Durante la instalación, puedes dejar las opciones predeterminadas o personalizarlas según tus preferencias.
1. Una vez completada la instalación, abre **Git Bash** desde el menú de inicio.
1. Configura tu nombre de usuario y correo electrónico:
   ```bash
   git config --global user.name "Tu Nombre"
   git config --global user.email "tuemail@example.com"
   ```

### Linux (Debian o Ubuntu)
1. Abre una terminal.
1. Actualiza la lista de paquetes:
   ```bash
   sudo apt update -y
   ```

1. Instala Git:
   ```bash
   sudo apt install -y git
   ```

1. Configura tu nombre de usuario y correo electrónico:
   ```bash
   git config --global user.name "Tu Nombre"
   git config --global user.email "tuemail@example.com"
   ```

### MacOS
1. Abre una terminal.
1. Instala Git usando Homebrew:
   ```bash
   brew install git
   ```
1. Configura tu nombre de usuario y correo electrónico:
   ```bash
   git config --global user.name "Tu Nombre"
   git config --global user.email "tuemail@example.com"
   ```

## 5. Crear una cuenta en GitHub
### Crear una cuenta en GitHub

1. Ve al [sitio oficial de GitHub](https://github.com/).
1. Haz clic en **Sign up** en la esquina superior derecha.
1. Introduce tu dirección de correo electrónico y haz clic en **Continue**.
1. Crea una contraseña y haz clic en **Continue**.
1. Elige un nombre de usuario y haz clic en **Continue**.
1. Completa el captcha y haz clic en **Create account**.
1. Verifica tu dirección de correo electrónico siguiendo el enlace que te enviaron.

### Configurar la sincronización de datos con la cuenta de Github (opcional)
1. En la barra de actividades, da click en el botón **Accounts** en la parte inferior izquierda.
1. Click en **Backup and Sync Settings...**
1. En la parte superior aparece una lista desplegable con las configuraciones y le das click en el botón **Sign in**.
1. Te sale otra lista preguntando por que tipo de cuenta se va a usar y se selecciona **Sign in with Github**.
1. Abrirá la ventana de inicio de sesión de Github y sigue las instrucciones para iniciar sesión.
1. Una vez que hayas iniciado sesión, podrás elegir qué configuraciones deseas sincronizar. Esto incluye configuraciones, atajos de teclado, fragmentos de usuario, tareas de usuario, estado de la interfaz de usuario y extensiones.
1. Después de configurar la sincronización, VSCode comenzará a sincronizar automáticamente tus configuraciones en segundo plano. Cada vez que inicies sesión en VSCode en otro dispositivo, tus configuraciones se sincronizarán automáticamente.
1. Puedes ajustar qué elementos se sincronizan y cómo se manejan los conflictos desde el menú de configuración de sincronización. Para acceder a esto, haz clic en el icono de engranaje nuevamente y selecciona **Settings Sync: Configure** (Configurar sincronización de configuración).

