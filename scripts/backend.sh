
alias jhpostgresqlup='docker-compose -f src/main/docker/postgresql.yml up -d'
alias jhrun='./gradlew bootRun --no-daemon'

PATH_BACKEND=".."

cd $PATH_BACKEND
jhpostgresqlup
sleep 5s
jhrun
