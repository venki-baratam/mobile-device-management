-----------------START--------------------

CREATE TABLE mdm_user (
    id bigint NOT NULL,
    email character varying(100) NOT NULL,
    mobile character varying(10) NOT NULL,
    name character varying(100) NOT NULL,
    address character varying(256) NOT NULL,
    createddate timestamp without time zone,
    lastmodifieddate timestamp without time zone,
    createdby bigint,
    lastmodifiedby bigint,
    version bigint
);

CREATE SEQUENCE seq_mdm_user
    START WITH 4
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE ONLY mdm_user
    ADD CONSTRAINT pk_mdm_user PRIMARY KEY (id);

------------------END---------------------