#!/bin/bash

DIR="generate/"
if [ -d "$DIR" ]; then
	echo "Introduce el nombre del proyecto a generar"

	projects=($(ls --directory generate/* | xargs -n 1 basename))

	for i in "${!projects[@]}"; do 
	  printf "%s\t%s\n" "$i" "${projects[$i]}"
	done

	read numProyecto
	
	echo "Introduce ruta donde se va a generar el proyecto"
	read pathProyecto
	
	echo "Generando proyecto [${projects[$numProyecto]}]..."

	folderProjectApp="$pathProyecto/${projects[$numProyecto]}"
	folderProjectGenerate="generate/${projects[$numProyecto]}"
	
	[ -d $folderProjectApp ] && rm -rf $folderProjectApp
	mkdir $folderProjectApp
	git clone git@github.com:Pmcb04/TrustOS-TFG.git $folderProjectApp

	ACTIONS_PATH="$folderProjectApp/src/main/webapp/app/modules/asset-action"
	JAVA_PATH="$folderProjectApp/src/main/java/com/mycompany/myapp/security"
	LIQUIBASE_PATH="$folderProjectApp/src/main/resources/config/liquibase"
	METADATA_PATH="$folderProjectApp/src/main/webapp/app/shared/components/metadata"
	UTIL_PATH="$folderProjectApp/src/main/webapp/app/shared/util"

	cp -R $folderProjectGenerate/asset-action/* $ACTIONS_PATH
	cp -R $folderProjectGenerate/java/* $JAVA_PATH
	cp -R $folderProjectGenerate/data/ $LIQUIBASE_PATH
	cp -R $folderProjectGenerate/metadata/* $METADATA_PATH
	cp -R $folderProjectGenerate/util/* $UTIL_PATH

	# install backend npm packages
	npm install --prefix $folderProjectApp

	# install frontend npm packages
	npm install --prefix $folderProjectApp/src/main/webapp

else
  ###  Control will jump here if $DIR does NOT exists ###
  echo "Primero debe generar la carpeta generate en este directorio con Acceleo"
  exit 1
fi
