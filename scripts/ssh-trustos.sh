ssh -fN trustos # <- en este caso se abre el puerto 5656

# Se abre un puerto en el ssh (configurar mediante ssh config file con el nombre trustos) para convertir puerto SOCKS en HTTP y poder lanzar las peticiones
# https://medium.com/teamarimac/access-a-server-through-ssh-tunnel-and-send-api-requests-through-postman-in-windows-10-b7307974c1a0


hpts -s 127.0.0.1:5656 -p 5657 # <- y el puerto para lanzar las peticiones es el 5657
