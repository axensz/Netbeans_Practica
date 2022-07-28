# MANUAL DE OPERACIONES - PUNTO 9
## Comandos necesarios
### Comando find
> Es una herramienta precisa para encontrar archivos y directorios y es compatible con casi todas las distribuciones de Linux.
> * find / -type f -mtime -n (Buscar a partir de la raíz, ficheros que su fecha de modificación es de hace n días). [^1]
### Comando crontab
> Es útil para realizar varias operaciones como manejar copias de seguridad automatizadas, rotar archivos de registro, sincronizar archivos entre máquinas remotas y borrar carpetas temporales, etc.
> * crontab -e [^2]

## Pasos para realizar el punto 9
1. Abrir la terminal de linux.
2. Escribir el comando "crontab -e" y elegir el editor de texto a preferencia (en este caso se usará nano).
3. Se mostrará en pantalla la interfaz del editor de texto. Nos moveremos hasta llegar abajo de los asteriscos, ya que en ese lugar debemos poner el comando.
5. Debemos escribir la hora y día que se repetirá la tarea y el comando que se hará (en este caso cada lunes a las 7 am). Sintaxis:
![image](https://user-images.githubusercontent.com/89235206/181645013-726b62c0-6bf5-4de8-bf2f-e40988951464.png) [^3]
6. Usaremos el comando:  **** 7 * * 1 find /etc/ -type f –mtime -7 > /home/usuario/resultado.txt**** y utilizaremos el re direccionamiento hacia un archivo de texto, ya que el usuario debe leer dicha información.
7. Por ultimo guardaremos el archivo con la combinación de teclas **Ctrl + O** y lo cerraremos con **ctrl + x**.

[^1]: [Crontab](https://geekflare.com/es/crontab-linux-with-real-time-examples-and-tools/).
[^2]: [Find](https://www.sysadmit.com/2018/08/linux-ver-ultimos-archivos-modificados.html).
[^3]: [Imagen de sintaxis](https://www.driverlandia.com/programar-tarea-en-linux-desde-consola-terminal/).
