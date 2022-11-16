
alias jhpostgresup='docker-compose -f src/main/docker/postgresql.yml up -d'
alias jhrun='./gradlew bootRun --no-daemon'

PATH_BACKEND=".."

cd $PATH_BACKEND
jhpostgresup
sleep 5s
jhrun
