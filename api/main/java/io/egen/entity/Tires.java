package io.egen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Tires
    {
        @Id
        @Column(columnDefinition = "VARCHAR(36)")
        private String tid;

        private int frontLeft;
        private int frontRight;
        private int rearLeft;
        private int rearRight;
        public Tires() {
            this.tid = UUID.randomUUID().toString();
        }

        public String getTid() {
            return tid;
        }

        public int getFrontLeft() {
            return frontLeft;
        }

        public void setFrontLeft(int frontLeft) {
            this.frontLeft = frontLeft;
        }

        public int getFrontRight() {
            return frontRight;
        }

        public void setFrontRight(int frontRight) {
            this.frontRight = frontRight;
        }

        public int getRearLeft() {
            return rearLeft;
        }

        public void setRearLeft(int rearLeft) {
            this.rearLeft = rearLeft;
        }

        public int getRearRight() {
            return rearRight;
        }

        public void setRearRight(int rearRight) {
            this.rearRight = rearRight;
        }

        @Override
        public String toString() {
            return "Tires{" +
                    "tid='" + tid + '\'' +
                    ", frontLeft=" + frontLeft +
                    ", frontRight=" + frontRight +
                    ", rearLeft=" + rearLeft +
                    ", rearRight=" + rearRight +
                    '}';
        }
    }


