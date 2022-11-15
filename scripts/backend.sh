
alias jhredisup='docker-compose -f src/main/docker/redis.yml up -d'
alias jhkeycloakup='docker-compose -f src/main/docker/keycloak.yml up -d'
alias jhmariaup='docker-compose -f src/main/docker/mariadb.yml up -d'
alias jhrun='./gradlew bootRun --no-daemon'

cd backend
jhredisup
jhmariaup
jhkeycloakup
jhrun
