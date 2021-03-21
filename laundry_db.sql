create database if not exists laundry_db;

use laundry_db;

create table t_advertisement
(
	adver_Id integer not null auto_increment primary key,
	adver_Url text
);


create table t_laundry
(
	laun_Id integer not null auto_increment primary key,
	laun_Name varchar(16),
	laun_Latitude decimal(10,7),
	laun_Longitude decimal(10,7),
	laun_Left integer,
                laun_state integer
);

create table t_laundry_m
(
	laun_m_Id integer not null auto_increment primary key,
	laun_Id integer,
	laun_Name varchar(16),
	laun_m_Name VARCHAR(16)

);

create table t_reservation
(
	reserv_Id integer not null auto_increment primary key,
	laun_Name varchar(16),
	laun_m_Name varchar(16),
	reserv_Time datetime,
	reserv_Mode varchar(16),
	reserv_Tempe integer,
	reserv_Money double,
	reserv_user_Id integer,
	reserv_user_Nname varchar(16),
	reserv_State varchar(16),
	reserv_Number varchar(16)
);


create table t_score
(
	socre_Id integer not null auto_increment primary key,
	score_user_Id integer,
	score_Time datetime,
	score_Change integer,
	score_laun_Id integer,
	score_laun_Name varchar(16),
	score_laun_m_Id integer,
	socre_laun_m_Name varchar(16),
	score_Reason integer

);


create table t_userinfo
(
	user_Id integer not null auto_increment primary key, 
	user_Openid varchar(32),
    user_Nickname varchar(32),
    user_Score integer
)



create table t_aiservice
(
	aiservice_Id integer not null auto_increment primary key,
	aiservice_Question varchar(32),
	aiservice_Answer varchar(64)
);


create table t_liquiddosage
(
	liquid_Id integer not null auto_increment primary key, 
	liquid_user_Id integer,
    	liquid_Time datetime,
    	liquid_Dosage integer,
	liquid_luan_Id integer,
	liquid_laun_Name varchar(16),
	liquid_Cost double
);

//新加入的
create table t_state_m
(
    laun_m_Id integer,
    laun_state integer,
    laun_start_time datetime,
    laun_model integer,
    laun_end_time datetime
);




