import React from "react";
import { Col, Container, Row } from "react-bootstrap";



//view date of web 
const Footer = () => {
    let today = new Date();

    return (
        <footer className="by-dark text-light py-3 footer mt-lg-5">
            <Container>
                <Row>
                    <Col xs={12} md={12} className="text-center">
                    <p>&copy; {today.getFullYear()} Booking Hotel</p>
                    </Col>
                </Row>
            </Container>
        </footer>
    )
}
export default Footer;