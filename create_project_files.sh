#!/bin/bash

PROJECT_ROOT="/home/danilo/Documentos/Programação/ws-eclipse/JavaBeecrowd"
PROJECT_NAME="JavaBeecrowd"

for dir in "$PROJECT_ROOT"/*/; do
  if [ -d "$dir" ]; then
    project_dir="${dir%/}"

    # Criar .project
    cat <<EOL > "$project_dir/.project"
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
    <name>$PROJECT_NAME</name>
    <comment></comment>
    <projects>
    </projects>
    <buildSpec>
        <buildCommand>
            <name>org.eclipse.jdt.core.javabuilder</name>
            <arguments>
            </arguments>
        </buildCommand>
    </buildSpec>
    <natures>
        <nature>org.eclipse.jdt.core.javanature</nature>
    </natures>
</projectDescription>
EOL

    # Criar .classpath
    cat <<EOL > "$project_dir/.classpath"
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
    <classpathentry kind="src" path="src"/>
    <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>
    <classpathentry kind="output" path="bin"/>
</classpath>
EOL
  fi
done
