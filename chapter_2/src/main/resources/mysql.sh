    #!/bin/sh
    NTERVAL=5
    PREFIX=$INTERVAL-sec-status
    RUNFILE=/usr/sh/running
    /usr/mysql/mysql5.7/bin/mysql -uroot -P*** -p*** -e 'show global variables'>>mysql-variables
    while  test -e $RUNFILE; do
            file=$(date +%F_%H)
            sleep=$(date +%s.%N |awk "{print $INTERVAL -($1 % $NTERVAL)}")
            sleep $sleep
            ts="$(date +"TS %s.%N %F %T")"
            loadavg="$(uptime)"
            echo "$ts $loadavg">> $PREFIX-${file}-status
            /usr/mysql/mysql5.7/bin/mysql  -uroot -P*** -p*** -e "show global status" >> $PREFIX-${file}-status &
            echo "$ts $loadavg">> $PREFIX-${file}-innodbstatus
            /usr/mysql/mysql5.7/bin/mysql   -uroot -P*** -p*** -e "show engine innodb status\G" >> $PREFIX-${file}-innodbstatus &
            echo "$ts $loadavg">> $PREFIX-${file}-processlist
            /usr/mysql/mysql5.7/bin/mysql  -uroot -P*** -p*** -e "show full processlist\G" >>$PREFIX-${file}-processlist &
            echo $ts
    done
    echo Exiting because $RUNFILE not exist