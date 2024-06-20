# Pobierz oficjalny obraz Jenkinsa LTS z Docker Hub
FROM jenkins/jenkins:lts

# Zmień użytkownika na root, aby móc instalować dodatkowe oprogramowanie
USER root

# Instaluj maven
RUN apt-get update && \
apt-get install -y maven

# Zmień użytkownika z powrotem na użytkownika Jenkinsa
USER jenkins

# Expose Jenkins port
EXPOSE 8080

# CMD to run Jenkins
CMD ["jenkins.sh"]
