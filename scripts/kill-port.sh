
# Script to kill the port that opened in ssh-trustos.sh if timed out of conection
kill $(lsof -t -i:5656) 
