-----------------START--------------------

CREATE TABLE user_mobile_map (
    id bigint NOT NULL,
    userid character varying(25),
    mobileid character varying(25),
    assigned boolean,
    createddate timestamp without time zone,
    lastmodifieddate timestamp without time zone,
    createdby bigint,
    lastmodifiedby bigint,
    version bigint
);
CREATE SEQUENCE seq_user_mobile_map
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE ONLY user_mobile_map
    ADD CONSTRAINT pk_user_mobile_map PRIMARY KEY (id);

------------------END---------------------